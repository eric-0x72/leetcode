package __basics;

public class jsonParse {

	public static void main(String[] args) {
		JSONObject obj = new JSONObject(JSON_DATA);
		JSONArray geodata = obj.getJSONArray("geodata");
		int n = geodata.length();
		for (int i = 0; i < n; ++i) {
			final JSONObject person = geodata.getJSONObject(i);
			System.out.println(person.getInt("id"));
			System.out.println(person.getString("name"));
			System.out.println(person.getString("gender"));
			System.out.println(person.getDouble("latitude"));
			System.out.println(person.getDouble("longitude"));
		}
	}
}
