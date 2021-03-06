package ch.viascom.hipchat.api.response;

import ch.viascom.hipchat.api.models.Capability;
import ch.viascom.hipchat.api.response.generic.Response;
import ch.viascom.hipchat.api.response.generic.ResponseHeader;
import lombok.Data;

/**
 * Created by Patrick Bösch on 09.05.16.
 */
@Data
public class GetCapabilitiesResponse extends Capability implements Response {
    private ResponseHeader responseHeader;
}
