<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
    
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>

<style >
/* Wrapper for the form */
form {
  width: 400px;
  margin: 50px auto;
  padding: 40px;
  background-color: #fff;
  border-radius: 10px;
  box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
}

/* Header for the form */
 h1{
  text-align: center;
  margin-bottom: 30px;
  font-size: 24px;
}

/* Input field wrapper */
input {
  position: relative;
  margin-bottom: 20px;
}

/* Input field */
input {
  width: 100%;
  padding: 10px;
  border: none;
  border-bottom: 2px solid #ccc;
  font-size: 16px;
  transition: border-bottom-color 0.3s ease;
}

/* Animate the input field border-bottom color on focus */
input:focus {
  border-bottom-color: #3b7fff;
  outline: none;
}

/* Animate the label when the input field is focused or has a value */

 input:focus ~ label, .input-wrapper input:not(:placeholder-shown) ~ label {
  top: -20px;
  left: 0;
  font-size: 14px;
  color: #3b7fff;
}

/* Submit button */
button[type="submit"] {
  display: block;
  width: 100%;
  padding: 10px;
  margin-top: 20px;
  font-size: 18px;
  color: #fff;
  background-color: #3b7fff;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: all 0.3s ease;
}

/* Animate the submit button on hover */
button[type="submit"]:hover {
  background-color: #2a63b4;
}

/* Animate the form wrapper on hover */
form:hover {
  transform: translateY(-5px);
  box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.2);
  transition: all 0.3s ease;
}

/* Animate the form wrapper on focus of any input field */
form input:focus ~ * {
  transform: translateY(-5px);
  box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.2);
  transition: all 0}
      a{
  display: inline-block;
  padding: 10px 20px;
  background-color: #4CAF50;
  color: white;
  border-radius: 5px;
  text-decoration: none;
  transition: transform 0.3s ease-in-out;
}

a:hover {
  transform: scale(1.1);
}


</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
<h1>Receptionist Register</h1>
<form:form action="/PatientAppointmentTrackingSystem/home/receptionistprocess" modelAttribute="receptionist">

Name:<form:input path="receptionistName"/>
Gender:<form:input path="receptionistGender"/>
Email:<form:input path="receptionistEmail"/>
Password:<form:password path="receptionistPassword"/>
Phone Number:<form:input path="receptionistNumber"/>
<input type="submit"/>
 <a href="/PatientAppointmentTrackingSystem/login/receptionistlogin">Already Have a Account Click here</a>
 </form:form>
 

</div>
</body>
</html>