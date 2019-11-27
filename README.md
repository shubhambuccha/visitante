# Visitante("Visitor" in Spanish)
<B>Visitanate</B> is an entry management application designed for the <B>Innovaccer's SummerGeek2020</B> assignment.

# Description
Visitante is an entry management <B>Android</B> application. When a visitor arrives in the office, he/she enters his details along with 
the host's details. Once he checks-in the host gets an sms and e-mail with all the information of the visitor.Once the meeting is complete,
the person can check themselves out in the checkout fragment and thier entry moves to the history fragment.

Compatible OS - Android<br/>
Frontend - Java<br/>
Backend - Firebase(Firestore)<br/>

# Installation
You can directly install the application by downloading Visitante.apk from apk folder.<br/>
You can also clone the repository(https://github.com/shubhambuccha/visitante.git) in the android studio and run it on your device/emulator.

# How to use?
<img src="https://github.com/shubhambuccha/visitante/blob/master/Innovacer%20assignment/1.jpg" width="290" height="550"><img src="https://github.com/shubhambuccha/visitante/blob/master/Innovacer%20assignment/2.jpg" width="290" height="550"><img src="https://github.com/shubhambuccha/visitante/blob/master/Innovacer%20assignment/3.jpg" width="290" height="550">
<br/>
<br/>
<B><I>This is the first screen which pop ups when the application starts. This is the form which the visitors need to fill when they arrive to the office. The visitor fills the form and clicks the Check-In button and a 
toast comes with Check-In Successful message and a email and sms is sent to the host about the details of the visitor and we automatically 
are redirected to the second screen.
</B></I>
<br/>
<br/>
<img src="https://github.com/shubhambuccha/visitante/blob/master/Innovacer%20assignment/4.jpg" width="300" height="550"><img src="https://github.com/shubhambuccha/visitante/blob/master/Innovacer%20assignment/5.jpg" width="300" height="550">
<br/>
<br/>
<B><I>
These are the screenshots of sms and email containing visitors details sent once the Check-In button is clicked.
</B></I>
<br/>
<br/>
<img src="https://github.com/shubhambuccha/visitante/blob/master/Innovacer%20assignment/6.jpg" width="300" height="550"><img src="https://github.com/shubhambuccha/visitante/blob/master/Innovacer%20assignment/7.jpg" width="300" height="550">
<br/>
<br/><B><I>
Once the Check-In button is clicked on the first screen we are redirected to the second screen. This screen contains all the current
visitors details sorted according to the visitor's check-in time. When the visitor is about to leave he/she clicks the Check-Out button
and his entry from the second screen is moved to third screen i.e. History tab. Also once he clicks the Check-Out button a email is sent
to the visitor about the details of his/her visit and we are redirected to the first screen where the Check-in form exists.</B></I>
<br/>
<br/>
<img src="https://github.com/shubhambuccha/visitante/blob/master/Innovacer%20assignment/8.jpg" width="300" height="550">
<br/>
<br/><B><I>
This is the third screen where you can see all the details of visitors history sorted according to the date and check-in time of the visitor.
</B></I>
<br/>
<br/>

# Database
<img src="https://github.com/shubhambuccha/visitante/blob/master/Innovacer%20assignment/database.PNG" width="600" height="330">
This is how database(firestore) looks in the background.

# Other APIs
<ul><li>JAVAMAIL (for sending e-mail).</li>
<li>FirebaseAuthentication (for Email & Password) based authentication</li>
</ul>
