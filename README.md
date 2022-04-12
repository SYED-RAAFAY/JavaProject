# GroT-Grocery-Tracker-
CS F213 OBJECT ORIENTED PROGRAMMING
Final Project

 ![image](https://user-images.githubusercontent.com/54977297/114083889-2d42c400-98cd-11eb-9fc7-e55885d1d838.png)


App Name: GroT-Grocery Tracker

Compatibility: Android 5.1 (Lollipop) and above (Tested on Android 10)

Team Members: 
      Shaik Mohammed Shaquib (2019A7PS1325H)
      Pathan Muhammed Bilal (2019A7PS0149H)
      Mohammed Zia Ur Rahman (2019A7PS0133H)
      A Rahul










ACKNOWLEDGEMENTS
Our deepest appreciation to our professors – Dr.Subhrakata Panda and Dr.DVN Siva Kumar who have taught us the course and to have helped us throughout the course.


ABSTRACT
‘GroT’ (Grocery Tracker) is a Java based application built on Android Studio and Firebase. It is proposed and intended in order to keep track of the regular activities and aid people in managing the daily home inventories. The app verifies the user mobile number using a One-Time Password to validate the account. It then takes in other details of the user. The dashboard and tracker have options to manage groceries, bills, home maintenance details etc along with the functionality of a to–do List. The ‘share’ feature allows the user to share the grocery list across multiple applications. The alarm feature in the to-do list has been added as an extra functionality.












FEATURE 1: MOBILE NUMBER VERIFICATION THROUGH OTP
The app takes in a 10-digit number to give a 6-digit OTP.
Initial Page: 

![image](https://user-images.githubusercontent.com/54977297/114084066-624f1680-98cd-11eb-9cb3-0a1c4f5681ac.png)


Wrong Number:  

![image](https://user-images.githubusercontent.com/54977297/114084100-69762480-98cd-11eb-89ce-12427ac984d3.png)


Empty Number:


![image](https://user-images.githubusercontent.com/54977297/114084181-801c7b80-98cd-11eb-9f1d-d95d3ff4fe60.png)

  

Initial OTP Page:		 		

![image](https://user-images.githubusercontent.com/54977297/114084202-87dc2000-98cd-11eb-9308-9532b432dcc4.png)


Wrong OTP Page:
 			 
![image](https://user-images.githubusercontent.com/54977297/114084221-8dd20100-98cd-11eb-8cbf-75642c653769.png)



FEATURE 2: Creating a GroT Account using Mail ID
Initial Page:			 

![image](https://user-images.githubusercontent.com/54977297/114084251-94607880-98cd-11eb-8291-87f218abeec1.png)


Next Page:

![image](https://user-images.githubusercontent.com/54977297/114084269-9c201d00-98cd-11eb-879e-5bfd2759cc4b.png)


  
The Username Field has been regexed to take in only small letters and numbers.
The email field has also been regexed to take in proper email IDs.
The Password Field has been regexed to take in a sequence containing atleast one of each of these 1.Small letter, 2.Capital letter, 3.Number and 4.Special character

![image](https://user-images.githubusercontent.com/54977297/114084304-a7734880-98cd-11eb-8a95-2bd7beafe553.png)


![image](https://user-images.githubusercontent.com/54977297/114084321-ac37fc80-98cd-11eb-9176-fa43391f6263.png)


![image](https://user-images.githubusercontent.com/54977297/114084337-b0fcb080-98cd-11eb-9fb2-6044e0e1e3f9.png)


![image](https://user-images.githubusercontent.com/54977297/114084352-b659fb00-98cd-11eb-8e26-b3643295531b.png)


![image](https://user-images.githubusercontent.com/54977297/114084367-bb1eaf00-98cd-11eb-8df0-8b01f350f31f.png)


![image](https://user-images.githubusercontent.com/54977297/114084389-c07bf980-98cd-11eb-8de6-3b17720d4138.png)


  

  

   
The Green and Red lights guide the user into registering through the right regex.












FEATURE 3: Choosing Profession

![image](https://user-images.githubusercontent.com/54977297/114084430-c96ccb00-98cd-11eb-83f6-5412ae517a92.png)

 






FEATURE 4: Dashboard

![image](https://user-images.githubusercontent.com/54977297/114084450-cf62ac00-98cd-11eb-868a-ab8cb6bb4633.png)

 






Home Maintenance:

![image](https://user-images.githubusercontent.com/54977297/114084466-d4bff680-98cd-11eb-8bef-afa958606be7.png)


![image](https://user-images.githubusercontent.com/54977297/114084479-d984aa80-98cd-11eb-8d43-4d5fdf71051c.png)

  











Bills:

![image](https://user-images.githubusercontent.com/54977297/114084495-df7a8b80-98cd-11eb-96b1-6f5a9e0bfd92.png)


![image](https://user-images.githubusercontent.com/54977297/114084516-e5706c80-98cd-11eb-80a0-7ef321f17a6f.png)


  











Manage Groceries:
Multiple items can be added in the list using the ‘+’ button.

![image](https://user-images.githubusercontent.com/54977297/114084543-ebfee400-98cd-11eb-97e6-ce59c9499e6b.png)


![image](https://user-images.githubusercontent.com/54977297/114084556-f0c39800-98cd-11eb-952a-6df54ea495bc.png)

  











The Grocery list can be shared using the share button.

![image](https://user-images.githubusercontent.com/54977297/114084571-f620e280-98cd-11eb-85bb-8d538388065c.png)

 









To-Do List:

![image](https://user-images.githubusercontent.com/54977297/114084597-fe791d80-98cd-11eb-8460-631e0237f46a.png)


![image](https://user-images.githubusercontent.com/54977297/114084614-033dd180-98ce-11eb-80a1-f8eb60fd94e6.png)

  

With add added functionality of an Alarm one-hour prior deadline.

![image](https://user-images.githubusercontent.com/54977297/114084641-0933b280-98ce-11eb-9b58-84c61666c75c.png)


![image](https://user-images.githubusercontent.com/54977297/114084653-0c2ea300-98ce-11eb-9d7e-fdf8f8a7a870.png)


![image](https://user-images.githubusercontent.com/54977297/114084668-0fc22a00-98ce-11eb-9ceb-bf96488f52fa.png)


  

 


Challenges Faced:
•	Sending OTP and validating it
•	Importing images to the project
•	Importing Date and Time and setting remainders
•	Using share option for sending information through other apps
Additional Functionalities:
•	Making an option to keep track of all-important monthly bills
•	Importing suitable images to make the app more user friendly
Platforms Used:
•	Android Studio (Complete Development)
•	Google Firebase (OTP Verification)
•	Cloud Store (Storing User Information)



