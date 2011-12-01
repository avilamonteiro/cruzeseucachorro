<%@ include file="../../../headerusuario.jsp" %> 

<div id="tabs">
 
		<a href="#tab_1" onclick="mudarTab(1)">Tab 1</a>
		<a href="#tab_2" onclick="mudarTab(2)">Tab 2</a>
		<a href="#tab_3" onclick="mudarTab(3)">Tab 3</a>
		<a href="#tab_4" onclick="mudarTab(4)">Tab 4</a>
 
		<div id="tab_1">conteudo tab 1
						<div id="cadastroUsuario" >
				<form action="<c:url value="/usuario/cadastrousuario"/>" id="cadastrousuarioFormAction" name="cadastrousuarioForm" method="post" class="rani">
						
					<ul class="cadastreusuario-form">
						<li><label for="usuarioNome"><fmt:message key="usuario.nome"/></label>
						<input id="usuarioNome" name="usuarioNome"/></li>
						<li><label for="usuarioSobrenome"><fmt:message key="usuario.sobrenome"/></label>
						<input id="usuarioSobrenome" name="usuarioSobrenome"/></li>
						<li><label for="usuarioEmail"><fmt:message key="usuario.email"/></label>
						<input id="usuarioEmail" name="usuarioEmail" /></li>
						<li><label> &nbsp; </label></li>
						<input type="submit" id="usuario.submit"  value="CADASTRAR!" class="cadastrese-botao" />
						<!-- <input type="button" value="LIMPAR" class="cadastrese-botao" id="btnlimpa" name="btnlimpa" /> -->
					</ul>
				</form>
			</div>
		
		</div>
		<div id="tab_2" style="display:none">conteudo tab 2</div>
 
		<div id="tab_3" style="display:none">conteudo tab 3</div>
		<div id="tab_4" style="display:none">conteudo tab 4</div>
	</div>

<div id="wrap">

			
<%@ include file="../../../footer.jsp" %>		