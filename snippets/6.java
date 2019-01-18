public static void main(String[] args) {
    try {
        FileOutputStream fosTrain =
            new FileOutputStream("file.tfrecords");
        DataOutputStream dosTrain =
            new DataOutputStream(fosTrain);
        TFRecordWriter tfWriterTrain =
            new TFRecordWriter(dosTrain);
    ...