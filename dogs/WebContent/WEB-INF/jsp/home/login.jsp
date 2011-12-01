
<%@ include file="../../../header.jsp" %> 
			<form action="${pageContext.request.contextPath}/login" name="loginForm" method="post">
				<div id="login" class="boluxa">
					<label class="labels"><fmt:message key="login.usuario" /></label> 
					<label class="labels"><fmt:message key="login.senha"/></label> 
					<br clear="all" /> 
					<input type="text" id="login" name="login" class="login" /> 
					<input type="password" name="senha" id="senha" class="login" /> 
					<input type="submit" id="submit" value="OK!" class="login-ok" /> 
					<br clear="all" /> <input type="checkbox" class="mnt-check" id="mnt-conectado" />
				    <span class="mantenha-conectado"><fmt:message key="login.conectado" /></span> 
				    <a href="#" class="esqueci"><fmt:message key="login.esquecisenha" /> </a>				
				</div>
			</form>
	</div>

		<c:if test="${not empty error}"><div id="errors">${error}</div></c:if>
		<c:if test="${not empty message}"><div id="messageerror>">${message}</div></c:if>
	<div id="wrap">
		<div id="main">
			<div id="conheca">
				<img src="${pageContext.request.contextPath}/images/ilustracoes.jpg" alt="" />
			</div>
			<div id="cadastrese" class="boluxa">
				<div id="titulo-cadastrese" style="margin-left: 100px;">
					<img src="${pageContext.request.contextPath}/images/dog_house.jpg" alt=""
						style="float: left; padding-right: 05px;" />
					<h1>Cadastre-se!</h1>
					<h4>É fácil, é rápido!</h4>
				</div>
				<form action="<c:url value="${pageContext.request.contextPath}/cadastro"/>" id="cadastroFormAction" name="cadastroForm" method="post" class="leide">
						
					<ul class="cadastrese-form">
						<li><label for="cadastroEmail"><fmt:message key="cadastro.email"/></label>
						<input id="cadastroEmail" name="cadastroEmail"/></li>
						<li><label for="cadastroSenha"><fmt:message key="cadastro.senha"/></label>
						<input id="cadastroSenha" name="cadastroSenha"/></li>
						<li><label for="cadastroRepeteSenha"><fmt:message key="cadastro.repetesenha"/></label>
						<input id="cadastroRepeteSenha" name="cadastroRepeteSenha" /></li>
						<li><label> &nbsp; </label></li>
						<input type="submit" id="usuario.submit"  value="CADASTRAR!" class="cadastrese-botao" />
						<!-- <input type="button" value="LIMPAR" class="cadastrese-botao" id="btnlimpa" name="btnlimpa" /> -->
					</ul>
				</form>
			</div>

		</div>
<%@ include file="../../../footer.jsp" %>



