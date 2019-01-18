private static Feature getIntFeature(int val) {
    Int64List int64List = Int64List.newBuilder()
        .addValue(val).build();
    Feature intFeature = Feature.newBuilder()
        .setInt64List(int64List).build();
    return intFeature;
}