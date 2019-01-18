JSONArray waldoJSON = (JSONArray)
    JSONValue.parse(new FileReader(new File("waldo.json")));

for(Object obj : waldoJSON) {
    JSONObject waldoEnt = (JSONObject)obj;
    Long id = (Long)waldoEnt.get("id");
    if(id <= 20) {
        runFile(waldoEnt, tfWriterTrain);
    } else {
        runFile(waldoEnt, tfWriterEval);
    }
}