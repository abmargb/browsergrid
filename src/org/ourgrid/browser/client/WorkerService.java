package org.ourgrid.browser.client;

import java.util.List;

import org.ourgrid.browser.shared.Execution;
import org.ourgrid.browser.shared.ResultFile;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("worker")
public interface WorkerService extends RemoteService {
	
	Execution getExecution() throws Exception;
	
	void sendResults(Execution execution, List<ResultFile> outputs) throws Exception;
	
}
