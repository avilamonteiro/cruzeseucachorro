package br.com.cruzeseucachorro.interceptor;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.resource.ResourceMethod;
import br.com.cruzeseucachorro.controller.HomeController;
import br.com.cruzeseucachorro.util.UsuarioSession;

public class AutorizacaoInterceptor implements Interceptor{

	private final UsuarioSession usuario;
	private final Result result;
	
	public AutorizacaoInterceptor(UsuarioSession usuario, Result result){
		this.usuario = usuario;
		this.result = result;
	}
	
	@Override
	public boolean accepts(ResourceMethod arg0) {
		return !usuario.isLogado();
	}

	@Override
	public void intercept(InterceptorStack arg0, ResourceMethod arg1,
			Object arg2) throws InterceptionException {
		result.redirectTo(HomeController.class).login();
	}

}
