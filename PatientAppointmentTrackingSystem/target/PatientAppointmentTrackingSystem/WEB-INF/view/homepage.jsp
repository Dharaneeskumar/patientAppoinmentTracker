<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
    
<!DOCTYPE html>
<html>
<head>
<style >
div {
  background-color: #f1f1f1;
  border: 2px solid #ccc;
  border-radius: 5px;
  padding: 20px;
  text-align: center;
  transition: all 0.3s ease-in-out;
}
div:hover {
  transform: scale(1.1);
  box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);
}

input {
  background-color: #4CAF50;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  font-size: 16px;
  cursor: pointer;
  transition: all 0.3s ease-in-out;
}

input:hover {
  background-color: #3e8e41;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="AD7BE9">
<h1>Apollo Hospital</h1>


<div>
<form:form  action="/PatientAppointmentTrackingSystem/home/admin">
<input  type="submit" value="Admin">
</form:form>

<div>
<form:form  action="/PatientAppointmentTrackingSystem/home/receptionist">
<input  type="submit" value="Receptionist">
</form:form>
<div>
<form:form  action="/PatientAppointmentTrackingSystem/home/doctor">
<input  type="submit" value="Doctor">
</form:form>
<div>
<form:form  action="/PatientAppointmentTrackingSystem/home/patient">
<input  type="submit" value="Patient">
</form:form>

</div>
</body>
</html>