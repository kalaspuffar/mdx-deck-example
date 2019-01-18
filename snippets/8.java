public static void runFile(JSONObject jsonObject, TFRecordWriter tfWriter) throws Exception {

    Long id = (Long)jsonObject.get("id");
    String filename = "waldo_"+id+".jpg";

    BufferedImage bi = ImageIO.read(
        new File("waldo_images/" + filename));

    int width = bi.getWidth();
    int height = bi.getHeight();
    ...