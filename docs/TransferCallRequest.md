# TransferCallRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**to** | **String** | The DID or SIP URI to dial out and bridge to the given call. | 
**from** | **String** | The &#x60;from&#x60; number to be used as the caller id presented to the destination (&#x60;to&#x60; number). The number should be in +E164 format. This attribute will default to the &#x60;from&#x60; number of the original call if omitted. |  [optional]
**audioUrl** | **String** | The URL of a file to be played back to the callee before bridging the call. The URL can point to either a WAV or MP3 file. |  [optional]
**timeoutSecs** | **Integer** | The number of seconds that Telnyx will wait for the call to be answered by the destination to which it is being transferred. If the timeout is reached before an answer is received, the call will hangup and a &#x60;call.hangup&#x60; webhook with a &#x60;hangup_cause&#x60; of &#x60;timeout&#x60; will be sent. Minimum value is 5 seconds. Maximum value is 120 seconds. |  [optional]
**timeLimitSecs** | **Integer** | Sets the maximum duration of a Call Control Leg in seconds. If the time limit is reached, the call will hangup and a &#x60;call.hangup&#x60; webhook with a &#x60;hangup_cause&#x60; of &#x60;time_limit&#x60; will be sent. For example, by setting a time limit of 120 seconds, a Call Leg will be automatically terminated two minutes after being answered. The default time limit is 14400 seconds or 4 hours and this is also the maximum allowed call length. |  [optional]
**answeringMachineDetection** | [**AnsweringMachineDetectionEnum**](#AnsweringMachineDetectionEnum) | Enables Answering Machine Detection. When a call is answered, Telnyx runs real-time detection to determine if it was picked up by a human or a machine and sends an &#x60;call.machine.detection.ended&#x60; webhook with the analysis result. If &#x27;greeting_end&#x27; or &#x27;detect_words&#x27; is used and a &#x27;machine&#x27; is detected, you will receive another &#x27;call.machine.greeting.ended&#x27; webhook when the answering machine greeting ends with a beep or silence. If &#x60;detect_beep&#x60; is used, you will only receive &#x27;call.machine.greeting.ended&#x27; if a beep is detected. |  [optional]
**answeringMachineDetectionConfig** | [**TransferCallRequestAnsweringMachineDetectionConfig**](TransferCallRequestAnsweringMachineDetectionConfig.md) |  |  [optional]
**customHeaders** | [**List&lt;CustomSipHeader&gt;**](CustomSipHeader.md) | Custom headers to be added to the SIP INVITE. |  [optional]
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore commands with the same &#x60;command_id&#x60;. |  [optional]
**sipAuthUsername** | **String** | SIP Authentication username used for SIP challenges. |  [optional]
**sipAuthPassword** | **String** | SIP Authentication password used for SIP challenges. |  [optional]

<a name="AnsweringMachineDetectionEnum"></a>
## Enum: AnsweringMachineDetectionEnum
Name | Value
---- | -----
DETECT | &quot;detect&quot;
DETECT_BEEP | &quot;detect_beep&quot;
DETECT_WORDS | &quot;detect_words&quot;
GREETING_END | &quot;greeting_end&quot;
DISABLED | &quot;disabled&quot;
