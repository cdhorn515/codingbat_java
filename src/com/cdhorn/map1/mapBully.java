public Map<String, String> mapBully(Map<String, String> map) {
	if (map.containsKey("a")) {
		String aKey = map.get("a");
		map.put("b", aKey);
		map.put("a", "");
		}
	return map;
}

