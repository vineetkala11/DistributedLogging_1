// package com.example.service.zipkin;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// protected static class ZipkinConfig {

//     @Bean(ZipkinAutoConfiguration.REPORTER_BEAN_NAME)
//     Reporter<zipkin2.Span> myReporter() {
//         return AsyncReporter.create(mySender());
//     }

//     @Bean(ZipkinAutoConfiguration.SENDER_BEAN_NAME)
//     MySender mySender() {
//         return new MySender();
//     }

//     static class MySender extends Sender {

//         private boolean spanSent = false;

//         boolean isSpanSent() {
//             return this.spanSent;
//         }

//         @Override
//         public Encoding encoding() {
//             return Encoding.JSON;
//         }

//         @Override
//         public int messageMaxBytes() {
//             return Integer.MAX_VALUE;
//         }

//         @Override
//         public int messageSizeInBytes(List<byte[]> encodedSpans) {
//             return encoding().listSizeInBytes(encodedSpans);
//         }

//         @Override
//         public Call<Void> sendSpans(List<byte[]> encodedSpans) {
//             this.spanSent = true;
//             return Call.create(null);
//         }

//     }

// }