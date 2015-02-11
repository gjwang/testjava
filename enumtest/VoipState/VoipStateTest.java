public class VoipStateTest {
    VoipState voipState = VoipState.IN_COMING;

	public VoipStateTest(VoipState voipState){
		this.voipState = voipState;
	}

    public static void main(String[] args) {
        System.out.println("VoipState = " + VoipState.IDLE);		
        System.out.println("VoipState = " + (new VoipStateTest(VoipState.IN_COMING)).voipState);
        System.out.println("VoipState.IDLE = " + VoipState.IDLE.ordinal());

		VoipState voipState = VoipState.IN_COMING;
        System.out.println("VoipState.IN_COMING = " + voipState + "=" + voipState.name() +"="+ voipState.ordinal());

		for (VoipState vs : VoipState.values()) {
			System.out.println("VoipState value=" + vs.ordinal() + " name=" + vs.name());
		}
    }
}