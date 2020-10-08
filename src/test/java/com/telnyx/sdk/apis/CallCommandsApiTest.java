/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.apis;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.models.AnswerRequest;
import com.telnyx.sdk.models.BridgeRequest;
import com.telnyx.sdk.models.CallControlCommandResponse;
import com.telnyx.sdk.models.CallRequest;
import com.telnyx.sdk.models.Errors;
import com.telnyx.sdk.models.GatherUsingAudioRequest;
import com.telnyx.sdk.models.GatherUsingSpeakRequest;
import com.telnyx.sdk.models.HangupRequest;
import com.telnyx.sdk.models.PlayAudioUrlRequest;
import com.telnyx.sdk.models.PlaybackStopRequest;
import com.telnyx.sdk.models.RejectRequest;
import com.telnyx.sdk.models.RetrieveCallStatusResponse;
import com.telnyx.sdk.models.SendDTMFRequest;
import com.telnyx.sdk.models.SpeakRequest;
import com.telnyx.sdk.models.StartForkingRequest;
import com.telnyx.sdk.models.StartRecordingRequest;
import com.telnyx.sdk.models.StopForkingRequest;
import com.telnyx.sdk.models.StopGatherRequest;
import com.telnyx.sdk.models.StopRecordingRequest;
import com.telnyx.sdk.models.TransferCallRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for CallCommandsApi
 */
@Ignore
public class CallCommandsApiTest {

    private final CallCommandsApi api = new CallCommandsApi();

    
    /**
     * Answer call
     *
     * Answer an incoming call. You must issue this command before executing subsequent commands on an incoming call.  **Expected Webhooks:**  - &#x60;call.answered&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callAnswerTest() throws ApiException {
        String callControlId = null;
        AnswerRequest answerRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callAnswer(callControlId, answerRequest);
        
        // TODO: test validations
    }
    
    /**
     * Bridge calls
     *
     * Bridge two call control calls.  **Expected Webhooks:**  - &#x60;call.bridged&#x60; for Leg A - &#x60;call.bridged&#x60; for Leg B 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callBridgeTest() throws ApiException {
        String callControlId = null;
        BridgeRequest bridgeRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callBridge(callControlId, bridgeRequest);
        
        // TODO: test validations
    }
    
    /**
     * Dial
     *
     * Dial a number or SIP URI from a given connection. A successful response will include a &#x60;call_leg_id&#x60; which can be used to correlate the command with subsequent webhooks.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callDialTest() throws ApiException {
        CallRequest callRequest = null;
        CompletableFuture<RetrieveCallStatusResponse> response = 
        api.callDial(callRequest);
        
        // TODO: test validations
    }
    
    /**
     * Forking start
     *
     * Call forking allows you to stream the media from a call to a specific target in realtime.  This stream can be used to enable realtime audio analysis to support a  variety of use cases, including fraud detection, or the creation of AI-generated audio responses.  Requests must specify either the &#x60;target&#x60; attribute or the &#x60;rx&#x60; and &#x60;tx&#x60; attributes.  **Expected Webhooks:**  - &#x60;call.fork.started&#x60; - &#x60;call.fork.stopped&#x60;  **Simple Telnyx RTP Encapsulation Protocol (STREP)**  *Note: This header/encapsulation is not used when the &#x60;rx&#x60; and &#x60;tx&#x60; parameters have been specified; it only applies when media is forked using the &#x60;target&#x60; attribute.*  If the destination for forked media is specified using the \&quot;target\&quot; attribute, the RTP will be encapsulated in an extra Telnyx protocol, which adds a 24 byte header to the RTP payload in each packet. The STREP header includes the Call Control &#x60;call_leg_id&#x60; for stream identification, along with bits that represent the direction (inbound or outbound) of the media. This 24-byte header sits between the UDP header and the RTP header.  The STREP header makes it possible to fork RTP for multiple calls (or two RTP streams for the same call) to the same IP:port, where the streams can be demultiplexed by your application using the information in the header. Of course, it&#39;s still possible to ignore this header completely, for example, if sending forked media for different calls to different ports or IP addresses. In this case, simply strip 24 bytes (or use the second byte to find the header length) from the received UDP payload to get the RTP (RTP header and payload).  &#x60;&#x60;&#x60; STREP Specification    0                   1                   2                   3   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |1 1|Version|L|D|    HeaderLen  |  reserved (2 bytes)           |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |       reserved (4 bytes, for UDP ports or anything else)      |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |               The call_leg_id                                 |  |                   from Call Control                           |  |                       (128 bits / 16 bytes)                   |  |                           (this is binary data)               |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   11    Static bits 11, always set to 11 to easily distinguish forked media    from RTP (10) and T.38 media (usually 00) and SIP (which begins    with a capital letter, so begins with bits 01). This is a magic number.   Version    Four bits to indicate the version number of the protocol, starting at 0001.   L    One bit to represent the leg of the call (A or B).    0 represents the A (first) leg of the call.    1 represents the B (second) leg of the call.   D    One bit to represent the direction of this RTP stream.    0 represents media received by Telnyx.    1 represents media transmitted by Telnyx.   HeaderLen (1 byte)    The length of the header in bytes.    Note that this value does not include the length of the payload. The total    size of the RTP can be calculated by subtracting the HeaderLen from the UDP    length (minus 8 for the UDP header).    In version 1, this value will always be 24.   Reserved (6 bytes)    Reserved for future use and to make sure that the header is a multiple of 32 bits   Call Leg ID    A 128-bit identifier for the call leg.    This is the call_leg_id from Call Control. &#x60;&#x60;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callForkStartTest() throws ApiException {
        String callControlId = null;
        StartForkingRequest startForkingRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callForkStart(callControlId, startForkingRequest);
        
        // TODO: test validations
    }
    
    /**
     * Forking stop
     *
     * Stop forking a call.  **Expected Webhooks:**  - &#x60;call.fork.stopped&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callForkStopTest() throws ApiException {
        String callControlId = null;
        StopForkingRequest stopForkingRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callForkStop(callControlId, stopForkingRequest);
        
        // TODO: test validations
    }
    
    /**
     * Gather stop
     *
     * Stop current gather.  **Expected Webhooks:**  - &#x60;call.gather.ended&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callGatherStopTest() throws ApiException {
        String callControlId = null;
        StopGatherRequest stopGatherRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callGatherStop(callControlId, stopGatherRequest);
        
        // TODO: test validations
    }
    
    /**
     * Gather using audio
     *
     * Play an audio file on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_audio_url&#39;, which will be played back at the beginning of each prompt. Playback will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_audio&#x60; command.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callGatherUsingAudioTest() throws ApiException {
        String callControlId = null;
        GatherUsingAudioRequest gatherUsingAudioRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callGatherUsingAudio(callControlId, gatherUsingAudioRequest);
        
        // TODO: test validations
    }
    
    /**
     * Gather using speak
     *
     * Convert text to speech and play it on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_payload&#39;, which will be played back at the beginning of each prompt. Speech will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_speak&#x60; command.  **Expected Webhooks:**  - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callGatherUsingSpeakTest() throws ApiException {
        String callControlId = null;
        GatherUsingSpeakRequest gatherUsingSpeakRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callGatherUsingSpeak(callControlId, gatherUsingSpeakRequest);
        
        // TODO: test validations
    }
    
    /**
     * Hangup call
     *
     * Hang up the call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.recording.saved&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callHangupTest() throws ApiException {
        String callControlId = null;
        HangupRequest hangupRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callHangup(callControlId, hangupRequest);
        
        // TODO: test validations
    }
    
    /**
     * Play audio URL
     *
     * Play an audio file on the call. If multiple play audio commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  *Notes:*  - When &#x60;overlay&#x60; is enabled, &#x60;loop&#x60; is limited to 1, and &#x60;target_legs&#x60; is limited to &#x60;self&#x60;. - A customer cannot Play Audio with &#x60;overlay&#x3D;true&#x60; unless there is a Play Audio with &#x60;overlay&#x3D;false&#x60; actively playing.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callPlaybackStartTest() throws ApiException {
        String callControlId = null;
        PlayAudioUrlRequest playAudioUrlRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callPlaybackStart(callControlId, playAudioUrlRequest);
        
        // TODO: test validations
    }
    
    /**
     * Stop audio playback
     *
     * Stop audio being played on the call.  **Expected Webhooks:**  - &#x60;call.playback.ended&#x60; or &#x60;call.speak.ended&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callPlaybackStopTest() throws ApiException {
        String callControlId = null;
        PlaybackStopRequest playbackStopRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callPlaybackStop(callControlId, playbackStopRequest);
        
        // TODO: test validations
    }
    
    /**
     * Recording start
     *
     * Start recording the call. Recording will stop on call hang-up, or can be initiated via the Stop Recording command.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callRecordStartTest() throws ApiException {
        String callControlId = null;
        StartRecordingRequest startRecordingRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callRecordStart(callControlId, startRecordingRequest);
        
        // TODO: test validations
    }
    
    /**
     * Recording stop
     *
     * Stop recording the call.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callRecordStopTest() throws ApiException {
        String callControlId = null;
        StopRecordingRequest stopRecordingRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callRecordStop(callControlId, stopRecordingRequest);
        
        // TODO: test validations
    }
    
    /**
     * Reject a call
     *
     * Reject an incoming call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callRejectTest() throws ApiException {
        String callControlId = null;
        RejectRequest rejectRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callReject(callControlId, rejectRequest);
        
        // TODO: test validations
    }
    
    /**
     * Send DTMF
     *
     * Sends DTMF tones from this leg. DTMF tones will be heard by the other end of the call.  **Expected Webhooks:**  There are no webhooks associated with this command. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callSendDTMFTest() throws ApiException {
        String callControlId = null;
        SendDTMFRequest sendDTMFRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callSendDTMF(callControlId, sendDTMFRequest);
        
        // TODO: test validations
    }
    
    /**
     * Speak text
     *
     * Convert text to speech and play it back on the call. If multiple speak text commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  **Expected Webhooks:**  - &#x60;call.speak.started&#x60; - &#x60;call.speak.ended&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callSpeakTest() throws ApiException {
        String callControlId = null;
        SpeakRequest speakRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callSpeak(callControlId, speakRequest);
        
        // TODO: test validations
    }
    
    /**
     * Transfer call
     *
     * Transfer a call to a new destination. If the transfer is unsuccessful, a &#x60;call.hangup&#x60; webhook for the other call (Leg B) will be sent indicating that the transfer could not be completed. The original call will remain active and may be issued additional commands, potentially transfering the call to an alternate destination.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.bridged&#x60; to Leg B - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callTransferTest() throws ApiException {
        String callControlId = null;
        TransferCallRequest transferCallRequest = null;
        CompletableFuture<CallControlCommandResponse> response = 
        api.callTransfer(callControlId, transferCallRequest);
        
        // TODO: test validations
    }
    
}
