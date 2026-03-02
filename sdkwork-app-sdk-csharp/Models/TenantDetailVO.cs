using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TenantDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Type { get; set; }
        public string? BizType { get; set; }
        public int? BizId { get; set; }
        public string? Status { get; set; }
        public string? Description { get; set; }
        public int? AdminUserId { get; set; }
        public InstallAppList? InstallAppList { get; set; }
        public TenantMetadata? Metadata { get; set; }
        public string? ContactPerson { get; set; }
        public string? ContactPhone { get; set; }
        public int? TokenExpirationMs { get; set; }
        public int? RefreshTokenExpirationMs { get; set; }
        public string? ExpireTime { get; set; }
    }
}
