<%@ include file="../../../header.jsp" %> 

	<form action="<c:url value="/home/cadastro"/>" id="cadastroFormAction" name="cadastroForm" method="post" class="leide">
						
					<ul class="cadastrese-form">
						<li><label for="perfilNome"><fmt:message key="perfil.nome"/></label>
						<input id="perfilNome" name="cadastroFormAction" /></li>
						<li><label for="perfilSobrenome"><fmt:message key="perfil.sobrenome"/></label>
						<input id="perfilSobrenome" name="cadastroEmail"/></li>
						<li><label for="perfilNascimento"><fmt:message key="perfil.dataNascimento"/></label>
						<input id="perfilNascimento" name="cadastroSenha"/></li>
						<li><label for="perfilCidade"><fmt:message key="perfil.cidade"/></label>
						<input id="perfilCidade" name="cadastroRepeteSenha" /></li>
						<li><label for="perfilEstado"><fmt:message key="perfil.estado"/></label>
						<input id="perfilEstado" name="cadastroSenha"/></li>
						<li><label for="perfilBairro"><fmt:message key="perfil.bairro"/></label>
						<input id="perfilBairro" name="cadastroRepeteSenha" /></li>
						<li><label for="perfilCodArea"><fmt:message key="perfil.codigoArea"/></label>
						<input id="perfilCodArea" name="cadastroRepeteSenha" /></li>
						<li><label for="perfilTelefone"><fmt:message key="perfil.telefone"/></label>
						<input id="perfilTelefone" name="cadastroRepeteSenha" /></li>
						
						<li><label> &nbsp; </label></li>
						<input type="submit" id="btnCadastrar" name="btnCadastrar" value="CADASTRAR!" class="cadastrese-botao" />
						<input type="button" value="LIMPAR" class="cadastrese-botao" id="btnlimpa" name="btnlimpa" />
					</ul>
				</form>
				
<%@ include file="../../../footer.jsp" %>