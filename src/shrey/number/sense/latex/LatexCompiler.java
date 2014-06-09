package shrey.number.sense.latex;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class LatexCompiler {
	private String latexSource;
	private String preferredName;
	private boolean finished = false;
	private byte[] result;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws IOException {
		Map obj = new LinkedHashMap();
		Map obj2 = new LinkedHashMap();
		obj2.put("here", "there");
		obj2.put("Something", new Integer(1421));
		obj.put("backup", obj2);
		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));
		obj.put("nickname", null);
		String jsonText = JSONValue.toJSONString(obj);
		System.out.print(jsonText);
	}

	public LatexCompiler(String source, String name) {
		latexSource = source;
		preferredName = name;
	}

	public boolean isFinished() {
		return finished;
	}

	public boolean isError() {
		return true;
	}

	private void compile() {
		JSONObject obj = new JSONObject();
	}
	
	public String generateJSON()  {
		
		return latexSource;	
	}

	public InputStream pdf() {
		if (!isFinished() || isError())
			throw new IllegalStateException(
					"Either the compilation didn't finish or was unsuccessful");
		return null;
	}

}
