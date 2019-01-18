Example example = Example.newBuilder()
    .setFeatures(features).build();
tfWriter.write(example.toByteArray());