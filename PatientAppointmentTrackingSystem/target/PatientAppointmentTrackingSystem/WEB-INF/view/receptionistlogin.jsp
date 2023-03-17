<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<style >

div {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  animation-name: slide-up;
  animation-duration: 1s;
}

@keyframes slide-up {
  0% {
    opacity: 0;
    transform: translate(-50%, 100%);
  }
  100% {
    opacity: 1;
    transform: translate(-50%, -50%);
  }
}

.form {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  background-color: #fff;
  padding: 20px;
  border-radius: 10px;
  box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
}

input,
button {
  padding: 10px;
  margin: 10px;
  width: 100%;
  border-radius: 5px;
  border: none;
}

input{
  background-color: #007bff;
  color: #fff;
  cursor: pointer;
}
input:hover {
  background-color: #0062cc;
}

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<form:form class="form" action="/PatientAppointmentTrackingSystem/login/receptionistprocess" modelAttribute="recep">

Email:<form:input path="receptionistEmail"/>
Password:<form:password path="receptionistPassword"/>
<input type="submit"/>

</form:form>
</div>
</body>
</html>