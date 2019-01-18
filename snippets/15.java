private static Feature getIntListFeature(List<Long> val) {
    Int64List int64List = Int64List.newBuilder()
        .addAllValue(val).build();
    Feature intFeature = Feature.newBuilder()
        .setInt64List(int64List).build();
    return intFeature;
}