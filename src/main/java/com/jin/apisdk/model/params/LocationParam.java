package com.jin.apisdk.model.params;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author jzy
 * @GitHub <a href="https://github.com/567jin">567jin</a>
 * @since 2024-02-26 10:18:07
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class LocationParam implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @NotNull
    private String fid;

}
