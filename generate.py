import gtk.gdk
import time
import subprocess
import glob
import html
from os.path import basename
import re
p = re.compile("static[ \t]+void[ \t]+main\(.*?\)[ \t\n\r]*\{")



author = "Madhurendra"

programs_d = {
	"AA_HelloWorld":"print hello world.",
	"BA_Average":"print average of an array",
	"CA_PatternNumber":"print a pattern",
	"DA_PatternStar":"print a pattern",
	"EA_PatternSweet":"print a pattern",
	"FA_Area":" find areas.",
	"GA_Armstrong":" find armstrong.",
	"HA_ArrayDemo":" demonstrate array.",
	"IA_Factorial":"print factorial of a number",
	"JA_BubbleSort":"sort using bubble sort",
	"KA_MatrixAdd":"add two matrix",
	"LA_Palindrome":"check if number is palindrome",
	"MA_FinalDemo":"show usage of final",
	"NA_FinalError":"show final method behaviour.",
	"OA_Inheritance":"demostrate inheritance",
	"PA_StackDemo":"show implementation of stack.",
	"QA_StringFunction": " demonstrate string functions.",
	"RA_thread" : "show threads usage.",
	"SA_MultiThread" : " demonstrate multithreading",
	"TA_Greatest":" find greatest number.",
	"UA_Cal":" use switch case.",
	"VA_FileHandling":" show File Handling.",
	"WA_Stack":" implement stack.",
	"XA_ConstructorOverloading":" show Constructor Overloading",
	"YA_ConstructorVsMethod":" differentiate between constructor & method.",
	"ZA_DefaultConstructor":"show default contructor.",
	"ZB_ParametarizedConstructor":"show parameterized contructor.",
	"ZC_Insertion":" implement insertion sort.",
	"ZD_FileHandling":"use FileHandling.",
	"ZE_Overloading":" show method overloading."
	}
programs = {}
# compile all java files


def file_get_contents(filename):
    with open(filename) as f:
        return f.read()


def create_file(program):
    doc = "<h1>Write a program to "+programs[program]+"</h1>";
    files  = glob.glob("./files/"+program+"/*.java")
    for val in files:
	    doc +="<h3>"+basename(val)+"</h3><div class='code'><code>"
	    data = file_get_contents(val)
	    m=[(m.end(0)) for m in p.finditer(data)];
	    if(len(m)):
		    m=m[0]
	            if(m>10) :
			        data = data[:m]+"\nSystem.out.println(\" By "+author+"\");"+data[m:]
	    doc+= html.escape(data)
	    doc+="</code></div>"

    doc+="<img src=\""+program+".png\"/>"
    return doc


def exec_java(java_file):
    print "$ javac "+java_file+".java && java "+java_file+"\n"

    proc = subprocess.Popen(["javac ./files/"+java_file+"/*.java"], shell=True)
    proc.communicate()[0]
    #print proc.returncode
    if proc.returncode ==0 :
		print "By "+author
		subprocess.call(['java', '-cp', './files/'+java_file+"/", java_file])
    print "\n\n"



def clear_terminal():
	print(chr(27) + "[2J")
	#time.sleep(1)



def take_active_window_screenshot(name):

	w = gtk.gdk.get_default_root_window()
	sz = w.get_size()
	#print "The size of the window is %d x %d" % sz

	#pb = gtk.gdk.Pixbuf(gtk.gdk.COLORSPACE_RGB,False,8,sz[0],sz[1])



	# Calculate the size of the whole screen
	screenw = gtk.gdk.screen_width()
	screenh = gtk.gdk.screen_height()

	# Get the root and active window
	root = gtk.gdk.screen_get_default()


	if root.supports_net_wm_hint("_NET_ACTIVE_WINDOW") and root.supports_net_wm_hint("_NET_WM_WINDOW_TYPE"):
		active = root.get_active_window()
		# You definately do not want to take a screenshot of the whole desktop, see entry 23.36 for that
		# Returns something like ('ATOM', 32, ['_NET_WM_WINDOW_TYPE_DESKTOP'])
		if active.property_get("_NET_WM_WINDOW_TYPE")[-1][0] == '_NET_WM_WINDOW_TYPE_DESKTOP' :
			print False

		# Calculate the size of the wm decorations
		relativex, relativey, winw, winh, d = active.get_geometry()
		w = winw + (relativex*2)
		h = winh + (relativey+relativex)

		# Calculate the position of where the wm decorations start (not the window itself)
		screenposx, screenposy = active.get_root_origin()
	else:
		print False


	#pb = pb.get_from_driawable(w,w.get_colormap(),100,0,0,0,sz[0],sz[1])
	pb = gtk.gdk.Pixbuf.get_from_drawable(gtk.gdk.Pixbuf(gtk.gdk.COLORSPACE_RGB, True, 8, w, h),
		gtk.gdk.get_default_root_window(),
		gtk.gdk.colormap_get_system(),
		screenposx, screenposy+80, 0, 0, w, h-80)

	if (pb != None):
		pb.save(name+".png","png")
		#print "Screenshot saved to "+name+".png."
	else:
		print "Unable to get the screenshot."


def generate_for_program(program):
	clear_terminal();
	exec_java(program);
	time.sleep(1)
	take_active_window_screenshot(program);
	return create_file(program);


content = "<link rel=\"stylesheet\" href=\"style.css\">";


for program in sorted(programs_d) :
  programs[program[3:]] = programs_d[program]
  content +=generate_for_program(program[3:]);


with open('output.html','w') as f:
    f.write(content)
margins = "20mm"
subprocess.call(['wkhtmltopdf',"-L",margins,"-R",margins,"-T",margins,"-B",margins,'output.html',author+'.pdf']);
