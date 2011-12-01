<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:setLocale value="${locale}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script type="text/javascript" src="../jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="../jquery.meio.mask.js"></script>
<script type="text/javascript" src="../js/jquery.validate.js"></script>
<script type="text/javascript" src="../js/jquery.validate.min.js"></script>
<script type="text/javascript" src="../jquery.metadata.js"></script>


<script type="text/javascript">
	var tabAtual = 1

	mudarTab = function(numeroTab) {
		$("#tab_"+tabAtual).toggle()
		$("#tab_"+numeroTab).toggle()
		tabAtual = numeroTab
	}
</script>


<link href="<c:url value="/cruze.css"/>" rel="stylesheet" type="text/css" media="screen" />
 

<title>Cruze Seu Cachorro!</title>


</head>
<body>
	<div id="header">
		<div id="logo">
				<img src="../images/logo_n.jpg" alt="" />
		</div>