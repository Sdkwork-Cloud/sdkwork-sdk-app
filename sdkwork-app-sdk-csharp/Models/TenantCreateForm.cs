using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TenantCreateForm
    {
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Type { get; set; }
        public string? BizType { get; set; }
        public int? BizId { get; set; }
        public string? Description { get; set; }
        public int? AdminUserId { get; set; }
        public string? ContactPerson { get; set; }
        public string? ContactPhone { get; set; }
        public string? ExpireTime { get; set; }
    }
}
