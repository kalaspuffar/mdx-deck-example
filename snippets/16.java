private static Feature getStringFeature(String val) {
    ByteString byteString =
        ByteString.copyFromUtf8(val);
    BytesList bytesList = BytesList.newBuilder()
        .addValue(byteString).build();
    Feature text = Feature.newBuilder()
        .setBytesList(bytesList).build();
    return text;
}