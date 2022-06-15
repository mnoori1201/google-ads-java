// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/conversion_upload_service.proto

package com.google.ads.googleads.v11.services;

public final class ConversionUploadServiceProto {
  private ConversionUploadServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_UploadClickConversionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_UploadClickConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_UploadClickConversionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_UploadClickConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_UploadCallConversionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_UploadCallConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_UploadCallConversionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_UploadCallConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_ClickConversion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_ClickConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_CallConversion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_CallConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_ExternalAttributionData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_ExternalAttributionData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_ClickConversionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_ClickConversionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_CallConversionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_CallConversionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_CustomVariable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_CustomVariable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_CartData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_CartData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_services_CartData_Item_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_services_CartData_Item_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v11/services/conv" +
      "ersion_upload_service.proto\022!google.ads." +
      "googleads.v11.services\0327google/ads/googl" +
      "eads/v11/common/offline_user_data.proto\032" +
      "@google/ads/googleads/v11/enums/conversi" +
      "on_environment_enum.proto\032\034google/api/an" +
      "notations.proto\032\027google/api/client.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032\027google/rpc/status." +
      "proto\"\274\001\n\035UploadClickConversionsRequest\022" +
      "\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022L\n\013conversions" +
      "\030\002 \003(\01322.google.ads.googleads.v11.servic" +
      "es.ClickConversionB\003\340A\002\022\034\n\017partial_failu" +
      "re\030\003 \001(\010B\003\340A\002\022\025\n\rvalidate_only\030\004 \001(\010\"\236\001\n" +
      "\036UploadClickConversionsResponse\0221\n\025parti" +
      "al_failure_error\030\001 \001(\0132\022.google.rpc.Stat" +
      "us\022I\n\007results\030\002 \003(\01328.google.ads.googlea" +
      "ds.v11.services.ClickConversionResult\"\272\001" +
      "\n\034UploadCallConversionsRequest\022\030\n\013custom" +
      "er_id\030\001 \001(\tB\003\340A\002\022K\n\013conversions\030\002 \003(\01321." +
      "google.ads.googleads.v11.services.CallCo" +
      "nversionB\003\340A\002\022\034\n\017partial_failure\030\003 \001(\010B\003" +
      "\340A\002\022\025\n\rvalidate_only\030\004 \001(\010\"\234\001\n\035UploadCal" +
      "lConversionsResponse\0221\n\025partial_failure_" +
      "error\030\001 \001(\0132\022.google.rpc.Status\022H\n\007resul" +
      "ts\030\002 \003(\01327.google.ads.googleads.v11.serv" +
      "ices.CallConversionResult\"\357\005\n\017ClickConve" +
      "rsion\022\022\n\005gclid\030\t \001(\tH\000\210\001\001\022\016\n\006gbraid\030\022 \001(" +
      "\t\022\016\n\006wbraid\030\023 \001(\t\022\036\n\021conversion_action\030\n" +
      " \001(\tH\001\210\001\001\022!\n\024conversion_date_time\030\013 \001(\tH" +
      "\002\210\001\001\022\035\n\020conversion_value\030\014 \001(\001H\003\210\001\001\022\032\n\rc" +
      "urrency_code\030\r \001(\tH\004\210\001\001\022\025\n\010order_id\030\016 \001(" +
      "\tH\005\210\001\001\022]\n\031external_attribution_data\030\007 \001(" +
      "\0132:.google.ads.googleads.v11.services.Ex" +
      "ternalAttributionData\022K\n\020custom_variable" +
      "s\030\017 \003(\01321.google.ads.googleads.v11.servi" +
      "ces.CustomVariable\022>\n\tcart_data\030\020 \001(\0132+." +
      "google.ads.googleads.v11.services.CartDa" +
      "ta\022I\n\020user_identifiers\030\021 \003(\0132/.google.ad" +
      "s.googleads.v11.common.UserIdentifier\022o\n" +
      "\026conversion_environment\030\024 \001(\0162O.google.a" +
      "ds.googleads.v11.enums.ConversionEnviron" +
      "mentEnum.ConversionEnvironmentB\010\n\006_gclid" +
      "B\024\n\022_conversion_actionB\027\n\025_conversion_da" +
      "te_timeB\023\n\021_conversion_valueB\020\n\016_currenc" +
      "y_codeB\013\n\t_order_id\"\223\003\n\016CallConversion\022\026" +
      "\n\tcaller_id\030\007 \001(\tH\000\210\001\001\022!\n\024call_start_dat" +
      "e_time\030\010 \001(\tH\001\210\001\001\022\036\n\021conversion_action\030\t" +
      " \001(\tH\002\210\001\001\022!\n\024conversion_date_time\030\n \001(\tH" +
      "\003\210\001\001\022\035\n\020conversion_value\030\013 \001(\001H\004\210\001\001\022\032\n\rc" +
      "urrency_code\030\014 \001(\tH\005\210\001\001\022K\n\020custom_variab" +
      "les\030\r \003(\01321.google.ads.googleads.v11.ser" +
      "vices.CustomVariableB\014\n\n_caller_idB\027\n\025_c" +
      "all_start_date_timeB\024\n\022_conversion_actio" +
      "nB\027\n\025_conversion_date_timeB\023\n\021_conversio" +
      "n_valueB\020\n\016_currency_code\"\253\001\n\027ExternalAt" +
      "tributionData\022(\n\033external_attribution_cr" +
      "edit\030\003 \001(\001H\000\210\001\001\022\'\n\032external_attribution_" +
      "model\030\004 \001(\tH\001\210\001\001B\036\n\034_external_attributio" +
      "n_creditB\035\n\033_external_attribution_model\"" +
      "\222\002\n\025ClickConversionResult\022\022\n\005gclid\030\004 \001(\t" +
      "H\000\210\001\001\022\016\n\006gbraid\030\010 \001(\t\022\016\n\006wbraid\030\t \001(\t\022\036\n" +
      "\021conversion_action\030\005 \001(\tH\001\210\001\001\022!\n\024convers" +
      "ion_date_time\030\006 \001(\tH\002\210\001\001\022I\n\020user_identif" +
      "iers\030\007 \003(\0132/.google.ads.googleads.v11.co" +
      "mmon.UserIdentifierB\010\n\006_gclidB\024\n\022_conver" +
      "sion_actionB\027\n\025_conversion_date_time\"\352\001\n" +
      "\024CallConversionResult\022\026\n\tcaller_id\030\005 \001(\t" +
      "H\000\210\001\001\022!\n\024call_start_date_time\030\006 \001(\tH\001\210\001\001" +
      "\022\036\n\021conversion_action\030\007 \001(\tH\002\210\001\001\022!\n\024conv" +
      "ersion_date_time\030\010 \001(\tH\003\210\001\001B\014\n\n_caller_i" +
      "dB\027\n\025_call_start_date_timeB\024\n\022_conversio" +
      "n_actionB\027\n\025_conversion_date_time\"{\n\016Cus" +
      "tomVariable\022Z\n\032conversion_custom_variabl" +
      "e\030\001 \001(\tB6\372A3\n1googleads.googleapis.com/C" +
      "onversionCustomVariable\022\r\n\005value\030\002 \001(\t\"\371" +
      "\001\n\010CartData\022\023\n\013merchant_id\030\006 \001(\003\022\031\n\021feed" +
      "_country_code\030\002 \001(\t\022\032\n\022feed_language_cod" +
      "e\030\003 \001(\t\022\036\n\026local_transaction_cost\030\004 \001(\001\022" +
      "?\n\005items\030\005 \003(\01320.google.ads.googleads.v1" +
      "1.services.CartData.Item\032@\n\004Item\022\022\n\nprod" +
      "uct_id\030\001 \001(\t\022\020\n\010quantity\030\002 \001(\005\022\022\n\nunit_p" +
      "rice\030\003 \001(\0012\364\004\n\027ConversionUploadService\022\211" +
      "\002\n\026UploadClickConversions\022@.google.ads.g" +
      "oogleads.v11.services.UploadClickConvers" +
      "ionsRequest\032A.google.ads.googleads.v11.s" +
      "ervices.UploadClickConversionsResponse\"j" +
      "\202\323\344\223\002:\"5/v11/customers/{customer_id=*}:u" +
      "ploadClickConversions:\001*\332A\'customer_id,c" +
      "onversions,partial_failure\022\205\002\n\025UploadCal" +
      "lConversions\022?.google.ads.googleads.v11." +
      "services.UploadCallConversionsRequest\032@." +
      "google.ads.googleads.v11.services.Upload" +
      "CallConversionsResponse\"i\202\323\344\223\0029\"4/v11/cu" +
      "stomers/{customer_id=*}:uploadCallConver" +
      "sions:\001*\332A\'customer_id,conversions,parti" +
      "al_failure\032E\312A\030googleads.googleapis.com\322" +
      "A\'https://www.googleapis.com/auth/adword" +
      "sB\210\002\n%com.google.ads.googleads.v11.servi" +
      "cesB\034ConversionUploadServiceProtoP\001ZIgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v11/services;services\242\002\003GAA\252\002!G" +
      "oogle.Ads.GoogleAds.V11.Services\312\002!Googl" +
      "e\\Ads\\GoogleAds\\V11\\Services\352\002%Google::A" +
      "ds::GoogleAds::V11::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v11.common.OfflineUserDataProto.getDescriptor(),
          com.google.ads.googleads.v11.enums.ConversionEnvironmentEnumProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_services_UploadClickConversionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_services_UploadClickConversionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_UploadClickConversionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Conversions", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v11_services_UploadClickConversionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v11_services_UploadClickConversionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_UploadClickConversionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v11_services_UploadCallConversionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v11_services_UploadCallConversionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_UploadCallConversionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Conversions", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v11_services_UploadCallConversionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v11_services_UploadCallConversionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_UploadCallConversionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v11_services_ClickConversion_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v11_services_ClickConversion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_ClickConversion_descriptor,
        new java.lang.String[] { "Gclid", "Gbraid", "Wbraid", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "OrderId", "ExternalAttributionData", "CustomVariables", "CartData", "UserIdentifiers", "ConversionEnvironment", "Gclid", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "OrderId", });
    internal_static_google_ads_googleads_v11_services_CallConversion_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v11_services_CallConversion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_CallConversion_descriptor,
        new java.lang.String[] { "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "CustomVariables", "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", });
    internal_static_google_ads_googleads_v11_services_ExternalAttributionData_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v11_services_ExternalAttributionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_ExternalAttributionData_descriptor,
        new java.lang.String[] { "ExternalAttributionCredit", "ExternalAttributionModel", "ExternalAttributionCredit", "ExternalAttributionModel", });
    internal_static_google_ads_googleads_v11_services_ClickConversionResult_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v11_services_ClickConversionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_ClickConversionResult_descriptor,
        new java.lang.String[] { "Gclid", "Gbraid", "Wbraid", "ConversionAction", "ConversionDateTime", "UserIdentifiers", "Gclid", "ConversionAction", "ConversionDateTime", });
    internal_static_google_ads_googleads_v11_services_CallConversionResult_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v11_services_CallConversionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_CallConversionResult_descriptor,
        new java.lang.String[] { "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", });
    internal_static_google_ads_googleads_v11_services_CustomVariable_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v11_services_CustomVariable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_CustomVariable_descriptor,
        new java.lang.String[] { "ConversionCustomVariable", "Value", });
    internal_static_google_ads_googleads_v11_services_CartData_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v11_services_CartData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_CartData_descriptor,
        new java.lang.String[] { "MerchantId", "FeedCountryCode", "FeedLanguageCode", "LocalTransactionCost", "Items", });
    internal_static_google_ads_googleads_v11_services_CartData_Item_descriptor =
      internal_static_google_ads_googleads_v11_services_CartData_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v11_services_CartData_Item_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_services_CartData_Item_descriptor,
        new java.lang.String[] { "ProductId", "Quantity", "UnitPrice", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v11.common.OfflineUserDataProto.getDescriptor();
    com.google.ads.googleads.v11.enums.ConversionEnvironmentEnumProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}