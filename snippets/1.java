/**
  * TFRecord format:
  * uint64 length
  * uint32 masked_crc32_of_length
  * byte   data[length]
  * uint32 masked_crc32_of_data
  */