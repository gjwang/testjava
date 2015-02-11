/**
* @author guijiewan@gmail.com
*/
 
public class HttpResponseTest { 
	public enum HttpResponse {
		SUCCESS(200), NOT_FOUND(404), TEMP_MOVE(302);
		private int responseCode;
 
		private HttpResponse(int responseCode) {
			this.responseCode = responseCode;
		}
	}

	private HttpResponse resp;

	public HttpResponseTest(HttpResponse resp){
		this.resp = resp;
	}

	public void onSuccess(){
		System.out.println("HttpResponse code: SUCCESS(200)");
	}
	
	public void onNotFound(){
		System.out.println("HttpResponse code: NOT_FOUND(404)");
	}

	public void onTempMove(){
			System.out.println("HttpResponse code: TEMP_MOVE(302)");
	}

	public static void main(String[] args) {
		for (HttpResponse response : HttpResponse.values()) {
			System.out.println("HttpResponse code: " + response.responseCode + " - Response Name: " + response);
			System.out.println("HttpResponse ordinal: " + response.ordinal() + " - Response Name: " + response.name());
		}

		HttpResponse resp = HttpResponse.SUCCESS;
		HttpResponseTest respTest = new HttpResponseTest(HttpResponse.SUCCESS);
		
		switch(resp){
		case SUCCESS:
			respTest.onSuccess();
			break;
		case NOT_FOUND:
			respTest.onNotFound();
			break;
		case TEMP_MOVE:
			respTest.onTempMove();
			break;
		default:
			System.out.println("HttpResponse code: should not be here");
			break;
		}

		//Or register process methon first, call the register method when response event happens
		//map<HttpResponse resp, doProcess()> respMap;
		//respMap[resp].doProcess();
	}
}