NUMBER SENSE
============


Description
------------


This is the first attempt at the LaTeX Number Sense generator. It can be used to
quickly, effectively, and, 'specifically' generate live NS material and on
demand. Of course, it is by far still in development. 


Platform Dependence
---------------------

As of now, this generator is highly platform dependent, do to the platform dependencies
associated with latex installations. This makes a port to a web server difficult. Hopefully a 
port to a CLSI interface as opposed to a local installation will make deployment a possibility
for widespread access.

Future Goals
---------------

Firstly, more Tricks need to be created for a more interactive and helpful user experience. 
The procedure for doing so can be
outlined as follows: 

1.  Create a class for your new Trick. You must extend class <code>Trick</code> and override the 
    <code>toL()</code> method. See the documentation of <code>toL()</code> in class <code>Trick</code> for details.
    Proper commenting is highly recommended. Look at the Tricks already
    created for reference/examples.
2.  (Optional, but recommended) Add description text for your class in the file
    Tipper.txt. Follow the format already presented.
    
