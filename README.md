# JAVA Comprehensive case study

In a Hospital there are many doctors are appointed. Doctors can be categorized based on their specialist.Each doctor had id, name, age, gender and specialist fields. Patients can be allowed to visit doctor for consultation. Each patient has properties like id, name, visitedDoctor, dateOfVisit. Develop the below functionalities based on the above senarios.

  1. Create doctor information.
  2. Create patient information. In patient creation page there should be one dropdown box where user needs to select a doctor name from the dropdown box.
  3. Create a tab for ShowDoctorInformation. Once user clicks on the showDoctorInformation page a new page will display where there is one dropdown box named as            selectedDoctor. Once User clicks on and select a doctor name from the dropdown box, it will display the doctor's information as table on the same page. It show        doctorname, specializationfiled and numberOfpatientAttended. 
  4. In show patient information tab once the user enter patient ID ina text box it will display the patient data like patient name, age, visitedDoctorName,                dateOfVisit and also the doctor's prescription. If there is no patient ID in the database then it will displayan error page "No such patient there in the              database".
  
Based on the above scenario create an java applicationwhere the UI design and page navigation should br developed by Angular.  
  
Front end application which developed through Angular should be interacted with Microservice application in the backend.

After development of the application make maven build and produce a jar file in target folder. Commit and push the code into GIT hub repository. Make Jenkins integration with GitHub repository. So thet there should be continuous development should be achieved.
