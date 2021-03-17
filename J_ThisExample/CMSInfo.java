package J_ThisExample;

import org.json.JSONObject;

public class CMSInfo {

	private final String signatureStatus;
	private final String signerCertificate;
	private final String signerIdentifier;

	public CMSInfo(JSONObject info) {
		this.signatureStatus = info.getString("signatureStatus");
		this.signerCertificate = info.getString("signerCertificate");
		this.signerIdentifier = info.getString("signerIdentifier");

	}

	public String getSignatureStatus() {
		return signatureStatus;
	}

	public String getSignerCertificate() {
		return signerCertificate;
	}

	public String getSignerIdentifier() {
		return signerIdentifier;
	}
}
