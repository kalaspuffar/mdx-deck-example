
    ...
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ImageIO.write(bi, "jpeg", baos);
    baos.flush();

    ByteString byteString = ByteString.copyFrom(baos.toByteArray());
    baos.close();
    BytesList bytesList = BytesList.newBuilder()
        .addValue(byteString).build();

    Feature text = Feature.newBuilder()
        .setBytesList(bytesList).build();
    return text;
}