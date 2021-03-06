package ch.viascom.hipchat.api.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by patrickboesch on 12.04.16.
 */
@Data
public class Member {
    /**
     * User's @mention name
     */
    @SerializedName("mention_name")
    private String mentionName;

    /**
     * An etag-like random version string.
     */
    private String version;

    /**
     * User's ID
     */
    private int id;

    /**
     * User's full name
     */
    private String name;

}
