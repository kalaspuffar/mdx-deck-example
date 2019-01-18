private static Feature getStringListFeature(List<String> val) {
    BytesList.Builder bBuilder = BytesList.newBuilder();
    for(String s : val) {
        ByteString byteString = ByteString
            .copyFromUtf8(s);
        bBuilder.addValue(byteString);
    }
    Feature text = Feature.newBuilder()
        .setBytesList(bBuilder.build()).build();
    return text;
}