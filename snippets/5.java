public static int maskedCrc32c(byte[] data,
        int offset, int length) {

    PureJavaCrc32C crc32c = new PureJavaCrc32C();
    crc32c.update(data, offset, length);
    int crc = (int)crc32c.getValue();
    return ((crc >>> 15) | (crc << 17)) + MASK_DELTA;

}