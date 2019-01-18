public void write(byte[] record, int offset, int length)
    throws IOException {

    byte[] len = toInt64LE(length);
    output.write(len);
    output.write(toInt32LE(maskedCrc32c(len)));
    output.write(record, offset, length);
    output.write(toInt32LE(maskedCrc32c(record, offset, length)));

}