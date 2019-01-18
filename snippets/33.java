eval_input_reader: {
  tf_record_input_reader {
    input_path: "[DATA_PATH]/[EVAL_FILE].tfrecords"
  }
  label_map_path: "[DATA_PATH]/[LABEL_FILE]waldo.pbtxt"
  shuffle: true
  num_readers: 1
}