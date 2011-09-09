Direct Electron Simple GUI plugin for Micro-Manager
=============

This project is designed to simplify the use of [Direct Electron](http://www.directelectron.com/)'s premium performance cameras for electron microscopy. 

The plugin is designed to work within the framework of the Open Source Microscopy Project [Micro-Manager](http://valelab.ucsf.edu/~MM/MMwiki/index.php/Main_Page) at the Vale laboratory at UCSF (funded by the NIH). 

Supported Cameras
-------

Direct Detection Device (DDD) cameras: 

* [DE-12 DDD camera](http://www.directelectron.com/ddd-cameras/overview/)

CCD cameras: 

* TBD

Installation & Usage
-----

* Make sure that you can operate the supported camera with the normal Micro-Manager GUI. 
* Place the .jar file from the Downloads section into the `mmplugins` folder (Typically on Windows:  `C:\Program Files\Micro-Manager-1.4\mmplugins`)
* Launch or re-launch Micro-Manager
* In the Micro-Manager GUI, choose Menu `Plugins` and then `Direct Electron GUI`

Support
------------

Issues can be reported here. Simply log in with your Github account and create a new issue. We will respond to your bug report or feature request accordingly. 

Contributing
------------

Developers can easily modify the plugin and add in more custom features or GUI component. 
Simply check out the source code using Git and use [Netbeans](http://netbeans.org/) to open the project. You should have the proper Micro-Manager version already installed. 

Project settings should work out of the box on Windows. 


Library used
-------

* [Micro-Manager](http://valelab.ucsf.edu/~MM/MMwiki/index.php/Main_Page)
* [JIDEsoft Java and Swing component provider](http://www.jidesoft.com/)