package entities;

import java.util.List;
import lombok.Data;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Data
@ToString
public class Administrator {
    
    private String name;
    private String mail;
    private String password;
    private String address;
    
    private List<String> perms;

    public Administrator() {
    }

    public Administrator(@NotNull String name, @NotNull String mail, @NotNull String password, @Nullable String address, @NotNull List<String> perms) {
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.address = address;
        this.perms = perms;
    }
    
}
