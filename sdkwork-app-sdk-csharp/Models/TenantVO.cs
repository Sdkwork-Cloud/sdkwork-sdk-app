using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TenantVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Type { get; set; }
        public string? BizType { get; set; }
        public string? Status { get; set; }
        public string? Description { get; set; }
        public string? ContactPerson { get; set; }
        public string? ContactPhone { get; set; }
        public string? ExpireTime { get; set; }
    }
}
