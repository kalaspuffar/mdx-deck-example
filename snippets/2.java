public class TFRecordWriter {
    private static final int MASK_DELTA = 0xa282ead8;
    private final DataOutput output;

    public TFRecordWriter(DataOutput output) {
        this.output = output;
    }

    ...