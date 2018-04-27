package net.gotev.sipservice;

public interface SipServiceConstants {

    /*
     * Intent Actions for Sip Service
     */
    String ACTION_RESTART_SIP_STACK = "restartSipStack";
    String ACTION_SET_ACCOUNT = "setAccount";
    String ACTION_REMOVE_ACCOUNT = "removeAccount";
    String ACTION_MAKE_CALL = "makeCall";
    String ACTION_HANG_UP_CALL = "hangUpCall";
    String ACTION_HANG_UP_CALLS = "hangUpCalls";
    String ACTION_HOLD_CALLS = "holdCalls";
    String ACTION_GET_CALL_STATUS = "getCallStatus";
    String ACTION_SEND_DTMF = "sendDtmf";
    String ACTION_ACCEPT_INCOMING_CALL = "acceptIncomingCall";
    String ACTION_DECLINE_INCOMING_CALL = "declineIncomingCall";
    String ACTION_SET_HOLD = "callSetHold";
    String ACTION_SET_MUTE = "callSetMute";
    String ACTION_TOGGLE_HOLD = "callToggleHold";
    String ACTION_TOGGLE_MUTE = "callToggleMute";
    String ACTION_TRANSFER_CALL = "callTransfer";
    String ACTION_GET_CODEC_PRIORITIES = "codecPriorities";
    String ACTION_SET_CODEC_PRIORITIES = "setCodecPriorities";
    String ACTION_GET_REGISTRATION_STATUS = "getRegistrationStatus";
    String ACTION_REFRESH_REGISTRATION = "refreshRegistration";
    String ACTION_SET_DND = "setDND";
    String ACTION_SET_INCOMING_VIDEO = "setIncomingVideo";
    String ACTION_SET_SELF_VIDEO_ORIENTATION = "setSelfVideoOrientation";
    String ACTION_TOGGLE_VIDEO_MUTE = "toggleVideoMute";
    String ACTION_START_VIDEO_PREVIEW = "startVideoPreview";
    String ACTION_STOP_VIDEO_PREVIEW = "stopVideoPreview";

    /*
     * Generic Parameters
     */
    String PARAM_ACCOUNT_DATA = "accountData";
    String PARAM_ACCOUNT_ID = "accountID";
    String PARAM_NUMBER = "number";
    String PARAM_CALL_ID = "callId";
    String PARAM_DTMF = "dtmf";
    String PARAM_HOLD = "hold";
    String PARAM_MUTE = "mute";
    String PARAM_CODEC_PRIORITIES = "codecPriorities";
    String PARAM_REG_EXP_TIMEOUT = "regExpTimeout";
    String PARAM_REG_CONTACT_PARAMS = "regContactParams";
    String PARAM_DND = "dnd";
    String PARAM_IS_VIDEO = "isVideo";
    String PARAM_IS_VIDEO_CONF = "isVideoConference";
    String PARAM_SURFACE = "surface";
    String PARAM_ORIENTATION = "orientation";

    /**
     * Specific Parameters passed in the broadcast intents.
     */
    String PARAM_REGISTRATION_CODE = "registrationCode";
    String PARAM_REMOTE_URI = "remoteUri";
    String PARAM_DISPLAY_NAME = "displayName";
    String PARAM_CALL_STATE = "callState";
    String PARAM_CALL_STATUS = "callStatus";
    String PARAM_CONNECT_TIMESTAMP = "connectTimestamp";
    String PARAM_STACK_STARTED = "stackStarted";
    String PARAM_CODEC_PRIORITIES_LIST = "codecPrioritiesList";
    String PARAM_LOCAL_HOLD = "localHold";
    String PARAM_LOCAL_MUTE = "localMute";
    String PARAM_LOCAL_VIDEO_MUTE = "localVideoMute";
    String PARAM_SUCCESS = "success";
}
