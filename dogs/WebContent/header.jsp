<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:setLocale value="${locale}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery.meio.mask.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery.metadata.js"></script>

<script type="text/javascript">

/*$.validator.setDefaults({
	submitHandler: function() { alert("submitted!"); }
});
*/


/*$().ready(function(){
	
	$("#btnlimpa").click(function(){
	$("#cadastroNome").val("");
	$("#cadastroEmail").val("");
	$("#cadastroSenha").val("");
	$("#cadastroRepeteSenha").val("");
});
*/

/*$('#btnCadastrar').click(function(){
})	*/
	

/* $("#cadastroFormAction").validate({
	
	rules:{
		cadastroNome: {
			
			required: true,
			minlength: 2
		},
		cadastroEmail: {
			
			required: true,
			email: true
		},
		cadastroSenha: {
			
			required: true,
			minlength: 5
		},
		cadastroRepeteSenha: {
			
			required: true,
			minlength: 5,
			equalTo: "#cadastroSenha"	
		}
		
		
	},
	messages: {
		cadastroNome: {
		
			required: "Por favor entre com um nome!",
			minlength: "Entre no minimo com mais de 2 caracteres!"
			
		},
		cadastroEmail: "Por favor entre com um e-mail valido!",
			
	
		cadastroSenha: {
			
			required: "Por favor entre com uma senha!",
			minlength: "Entre no minimo com mais de 5 caracteres!"
			
		},
		cadastroRepeteSenha: {
			
			required: "Por favor entre com uma senha!",
			minlength: "Entre no minimo com mais de 5 caracteres!",
			equalTo: "A senha deve ser a mesma senha anteriormente!"
			
		}
		
		}
	})
})		

*/


</script>
<link href="${pageContext.request.contextPath}/css/cruze.css" rel="stylesheet" type="text/css" media="screen" />
 

<title>Cruze Seu Cachorro!</title>


</head>
<body>
	<div id="header">
		<div id="pegada">
				<img src="${pageContext.request.contextPath}/images/ill_pegada.jpg" />
		</div>
		<div id="logo">
				<img src="${pageContext.request.contextPath}/images/logo_n.jpg"/>
		</div>