Joshua Stark – ST10092579 
Joshua van Rooyen – ST10153536 
Kiolin Harisanker – ST10091180 
Antonio Cristaudi – ST10090982 
Londa Mokoena – ST10090324
Muhammed Saad Essop – ST10090552  


OPSC7312
Group 1
POE
Aves ReadME File

 
Installation Readme for Tempus POE [Aves]
*
*  Please refer to the system requirements for the operating systems
*  supported by the POE [Aves].
*

************************************************************
************************************************************

************************************************************
*  CONTENTS OF THIS DOCUMENT
************************************************************

This document contains the following sections:

1.  Overview for POE [Aves]
2.  System Requirements for POE [Aves]
3.  Installing the Software for POE [Aves]

************************************************************
* 1.  OVERVIEW
************************************************************
The program for POE is built to be an Android App Prototype
The application makes use of Kotlin and XML 
 
************************************************************
* 2.  SYSTEM REQUIREMENTS
************************************************************

FOR RUNNING EMULATOR ON ANDROID STUDIO:

1.  The system must be running on one of the following
    operating systems:
    
    - 64-bit Microsoft Windows 8,10,11
    - Minimum API 30, Recommended API 33

2. The following operating systems are not supported:

    Any version of the following Microsoft operating systems:
    - MS-DOS
    - Windows 3.1
    - Windows NT 3.51
    - Windows 95
    - Windows 98
    - Windows NT 4.0

    Any version of the following operating systems:
    - Linux

3.   The system should contain at least 8 GB RAM or more of minimum system 
     memory required by the operating system and 8 GB of available disk space minimum (IDE + Android SDK + Android Emulator)

4.   The following additional software is required:
     - Android Studio (Electric Eel, Flamingo)

FOR RUNNING ON ANDROID MOBILE PHONE:

1.   The android phone must be running on the following operating systems:

     - Any android device running Android 9 and above
 
2. The following operating systems are not supported:

     - IOS
     - HarmonyOS
     - Windows Phone 

DEVICE SPECIFICATION:

ACTIVE INTERNET CONNECTION

WORKIGNG CAMERA
************************************************************
* 3.  INSTALLING THE SOFTWARE
************************************************************

1. Unzip [Aves.POE]
   Right click on folder and then select extract all
   to remove it from the zipped file into a normal format.

2. Open File on Android Studio
     - Select [Aves]


3. Run the code 


************************************************************
* 4.  User guide
************************************************************

1. Registration and Login:

- On application launch, create a new account by providing the required information.
- Once registered, simply go back and you will be automitically logged in.

2. Configure Maximum Radius:

- After logging in, select 3 lines on the top left (options icon)
- Navigate to the "Settings" tab.
- Select "Kilometres (KM)" or "Miles (m)".
- Porvide the max distance you'd like.
- Select "Confirm" then return to home page (Map screen).

3. Adding Observation:

- Select Options icon.
- Select "Add observation".
- Enter the name, family name, bird description and colour description.
- Select camera icon to either add a photo, take a photo or use app icon as photo.
- Select "Save"

4. Navigate to Observation/Green Hotspot:

- Select a Green Hotspot/Observation
- Select "Navigate"

5. View observation:

- Select Options icon.
- Select "List of observations".
- Select an observation to view more details.


6. View profile details/forgot password:

- Select Options icon.
- Select "Profile".
- Edit/View details.
- Select "Forgot Password" to reset password.

7. Logout:

- Select Options icon
- Select "Logout"




************************************************************
* 5.  Video Instruction
************************************************************

1. Unzip [Aves.Poe]
    Right click on folder and then select extract all
    to remove it from the zipped file into a normal format.

2. Select AvesVideo

3. Open video and enjoy

************************************************************
* 6.  To-Do
************************************************************

• The user must be able to register using the app.
• The user must be able to login to the app using a username and password.

• The user must be able to change their settings including but not limited to the following:

	o Toggle between using the metric system (kilometres) or using the imperial system (miles)
	o The maximum distance that the user is willing to travel to a bird watching hotspot.

• The user must be able to view nearby birding hotspots on a map (use a webservice to obtain
  this information – have a look at eBird API 2.0). The map component must be embedded in the app.
• The app must display hotspots filtered according to the preferred maximum distance chosen by the user.
• The app must display the user’s current position on the map.
• The user must be able to select a hotspot on the map to get directions to the hotspot.
• The app must then be able to calculate the best route between your current location and the hotspot.
• The app must display this route visually (on the embedded map).
• The app must allow the user to save a bird observation at their currently location.
• The app must allow the user to view all their bird observations.
• The registration information must be stored in an online, hosted authentication service. ~ (Part 3 only)

• The settings and user bird observations must be stored in an online, hosted database. ~ (Part 3 only)
• The app must display bird observations on the map. ~ (Part 3 only)

************************************************************
* 7.  Pre-populated Login
************************************************************

Email: st10090324@vcconnect.edu.za
Password: LonTre@123

************************************************************
* 8.  Map Information
************************************************************
Red marker 
Populated positions from the api with no api data due to observations not being logged on ebird app 

Green marker 
Data populated from the api and has data available 

Eye marker 
This is aves user observations which is displayed on the map at the place they logged the bird 



Feature 1:
Able to search the api for birds and display it on the home page.

Feature 2: 
Start and log competitive times in a function called "Aves session".
