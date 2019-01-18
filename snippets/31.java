train_input_reader: {
  tf_record_input_reader {
    input_path: "[DATA_PATH]/[TRAIN_FILE].tfrecords"
  }
  label_map_path: "[DATA_PATH]/[LABEL_FILE].pbtxt"
  shuffle: true
  num_readers: 1
}