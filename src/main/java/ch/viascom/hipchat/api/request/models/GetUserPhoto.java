package ch.viascom.hipchat.api.request.models;

import ch.viascom.hipchat.api.models.user.UserPhotoSize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by patrickboesch on 19.04.16.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserPhoto {
    private String userId;
    private UserPhotoSize size;
}
