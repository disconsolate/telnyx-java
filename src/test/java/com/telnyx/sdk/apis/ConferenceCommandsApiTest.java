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
import com.telnyx.sdk.models.ConferenceCallRequest;
import com.telnyx.sdk.models.ConferenceCommandResponse;
import com.telnyx.sdk.models.ConferenceHoldRequest;
import com.telnyx.sdk.models.ConferenceMuteRequest;
import com.telnyx.sdk.models.ConferencePlayRequest;
import com.telnyx.sdk.models.ConferenceResponse;
import com.telnyx.sdk.models.ConferenceSpeakRequest;
import com.telnyx.sdk.models.ConferenceUnholdRequest;
import com.telnyx.sdk.models.ConferenceUnmuteRequest;
import com.telnyx.sdk.models.CreateConferenceRequest;
import com.telnyx.sdk.models.JoinConferenceRequest;
import com.telnyx.sdk.models.ListConferencesResponse;
import com.telnyx.sdk.models.ListParticipantsResponse;
import com.telnyx.sdk.models.StartRecordingRequest;
import com.telnyx.sdk.models.StopRecordingRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConferenceCommandsApi
 */
@Ignore
public class ConferenceCommandsApiTest {

    private final ConferenceCommandsApi api = new ConferenceCommandsApi();

    
    /**
     * Dial a new participant into a conference
     *
     * Dials a phone number and, when the call is answered, automatically joins them into the specified conference.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.answered&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferenceDialParticipantInTest() throws ApiException {
        String id = null;
        ConferenceCallRequest conferenceCallRequest = null;
        ConferenceCommandResponse response = api.conferenceDialParticipantIn(id, conferenceCallRequest)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Hold conference participants
     *
     * Hold a list of participants in a conference call
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferenceHoldParticipantsTest() throws ApiException {
        String id = null;
        ConferenceHoldRequest conferenceHoldRequest = null;
        ConferenceCommandResponse response = api.conferenceHoldParticipants(id, conferenceHoldRequest)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Join a conference
     *
     * Join an existing call leg to a conference. Issue the Join Conference command with the conference ID in the path and the &#x60;call_control_id&#x60; of the leg you wish to join to the conference as an attribute.  **Expected Webhooks:**  - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferenceJoinTest() throws ApiException {
        String id = null;
        JoinConferenceRequest joinConferenceRequest = null;
        ConferenceCommandResponse response = api.conferenceJoin(id, joinConferenceRequest)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Mute conference participants
     *
     * Mute a list of participants in a conference call
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferenceMuteParticipantsTest() throws ApiException {
        String id = null;
        ConferenceMuteRequest conferenceMuteRequest = null;
        ConferenceCommandResponse response = api.conferenceMuteParticipants(id, conferenceMuteRequest)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Play audio to conference participants
     *
     * Play audio to all or some participants on a conference call.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferencePlayAudioTest() throws ApiException {
        String id = null;
        ConferencePlayRequest conferencePlayRequest = null;
        ConferenceCommandResponse response = api.conferencePlayAudio(id, conferencePlayRequest)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Speak text to conference participants
     *
     * Convert text to speech and play it to all or some participants.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferenceSpeakTextTest() throws ApiException {
        String id = null;
        ConferenceSpeakRequest conferenceSpeakRequest = null;
        ConferenceCommandResponse response = api.conferenceSpeakText(id, conferenceSpeakRequest)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Conference recording start
     *
     * Start recording the conference. Recording will stop on conference end, or via the Stop Recording command.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferenceStartRecordingTest() throws ApiException {
        String id = null;
        StartRecordingRequest startRecordingRequest = null;
        ConferenceCommandResponse response = api.conferenceStartRecording(id, startRecordingRequest)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Conference recording stop
     *
     * Stop recording the conference.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferenceStopRecordingTest() throws ApiException {
        String id = null;
        StopRecordingRequest stopRecordingRequest = null;
        ConferenceCommandResponse response = api.conferenceStopRecording(id, stopRecordingRequest)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Unhold conference participants
     *
     * Unhold a list of participants in a conference call
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferenceUnholdParticipantsTest() throws ApiException {
        String id = null;
        ConferenceUnholdRequest conferenceUnholdRequest = null;
        ConferenceCommandResponse response = api.conferenceUnholdParticipants(id, conferenceUnholdRequest)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Unmute conference participants
     *
     * Unmute a list of participants in a conference call
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conferenceUnmuteParticipantsTest() throws ApiException {
        String id = null;
        ConferenceUnmuteRequest conferenceUnmuteRequest = null;
        ConferenceCommandResponse response = api.conferenceUnmuteParticipants(id, conferenceUnmuteRequest)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Create conference
     *
     * Create a conference from an existing call leg using a &#x60;call_control_id&#x60; and a conference name. Upon creating the conference, the call will be automatically bridged to the conference. Conferences will expire after all participants have left the conference or after 4 hours regardless of the number of active participants.  **Expected Webhooks:**  - &#x60;conference.created&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; - &#x60;conference.ended&#x60; - &#x60;conference.recording.saved&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConferenceTest() throws ApiException {
        CreateConferenceRequest createConferenceRequest = null;
        ConferenceResponse response = api.createConference(createConferenceRequest)
                .execute();

        // TODO: test validations
    }
    
    /**
     * List conference participants
     *
     * Lists conference participants
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listConferenceParticipantsTest() throws ApiException {
        String conferenceId = null;
        Boolean filterMuted = null;
        Boolean filterOnHold = null;
        Boolean filterWhispering = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        ListParticipantsResponse response = api.listConferenceParticipants(conferenceId)
                .filterMuted(filterMuted)
                .filterOnHold(filterOnHold)
                .filterWhispering(filterWhispering)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();

        // TODO: test validations
    }
    
    /**
     * List conferences
     *
     * Lists conferences. Conferences are created on demand, and will expire after all participants have left the conference or after 4 hours regardless of the number of active participants. Conferences are listed in descending order by &#x60;expires_at&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listConferencesTest() throws ApiException {
        String filterName = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        ListConferencesResponse response = api.listConferences()
                .filterName(filterName)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();

        // TODO: test validations
    }
    
    /**
     * Retrieve a conference
     *
     * Retrieve an existing conference
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveConferenceTest() throws ApiException {
        String id = null;
        ConferenceResponse response = api.retrieveConference(id)
                .execute();

        // TODO: test validations
    }
    
}
