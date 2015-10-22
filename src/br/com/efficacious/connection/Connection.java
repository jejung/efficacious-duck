package br.com.efficacious.connection;

import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class Connection implements Callable<URLConnection> {
	private URL url;
	
	public Connection(URL url) {
		this.url = url;
	}
	
	@Override
	public URLConnection call() throws Exception {
		
		// waits for the proxy configuration completes
//		NetConfig.instance().getLatch().await();
		
//		if (NetConfig.instance().getProxy() == null)
			return url.openConnection();
//		else
//			return url.openConnection(NetConfig.instance().getProxy());
	}
}
