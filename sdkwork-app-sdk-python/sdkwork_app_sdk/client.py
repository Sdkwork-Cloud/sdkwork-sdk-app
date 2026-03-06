from .http_client import HttpClient, SdkConfig
from .api.workspaces import WorkspacesApi
from .api.voice_speaker import VoiceSpeakerApi
from .api.video import VideoApi
from .api.user import UserApi
from .api.tool import ToolApi
from .api.tenant import TenantApi
from .api.social import SocialApi
from .api.skill import SkillApi
from .api.shops import ShopsApi
from .api.share import ShareApi
from .api.settings import SettingsApi
from .api.ai import AiApi
from .api.projects import ProjectsApi
from .api.products import ProductsApi
from .api.partner import PartnerApi
from .api.notification import NotificationApi
from .api.notes import NotesApi
from .api.news import NewsApi
from .api.music import MusicApi
from .api.knowledge_documents import KnowledgeDocumentsApi
from .api.invoice import InvoiceApi
from .api.image import ImageApi
from .api.style import StyleApi
from .api.file_system import FileSystemApi
from .api.feedback import FeedbackApi
from .api.favorite import FavoriteApi
from .api.drive import DriveApi
from .api.documents import DocumentsApi
from .api.dashboard import DashboardApi
from .api.collection import CollectionApi
from .api.chat import ChatApi
from .api.character import CharacterApi
from .api.category import CategoryApi
from .api.cart import CartApi
from .api.assets import AssetsApi
from .api.app import AppApi
from .api.announcement import AnnouncementApi
from .api.agent import AgentApi
from .api.advert import AdvertApi
from .api.wallet import WalletApi
from .api.vote import VoteApi
from .api.vip import VipApi
from .api.upload import UploadApi
from .api.search import SearchApi
from .api.rtc import RtcApi
from .api.payments import PaymentsApi
from .api.organization import OrganizationApi
from .api.orders import OrdersApi
from .api.model import ModelApi
from .api.history import HistoryApi
from .api.sound_effect import SoundEffectApi
from .api.generation import GenerationApi
from .api.audio import AudioApi
from .api.feed import FeedApi
from .api.currency import CurrencyApi
from .api.coupons import CouponsApi
from .api.comments import CommentsApi
from .api.auth import AuthApi
from .api.audit import AuditApi
from .api.analytics import AnalyticsApi
from .api.agent_memory import AgentMemoryApi
from .api.activity import ActivityApi
from .api.account import AccountApi
from .api.ab import AbApi
from .api.sku import SkuApi


class SdkworkAppClient:
    """sdkwork-app-sdk SDK Client."""

    def __init__(self, config: SdkConfig):
        self._client = HttpClient(config)
        self.workspaces: WorkspacesApi
        self.voice_speaker: VoiceSpeakerApi
        self.video: VideoApi
        self.user: UserApi
        self.tool: ToolApi
        self.tenant: TenantApi
        self.social: SocialApi
        self.skill: SkillApi
        self.shops: ShopsApi
        self.share: ShareApi
        self.settings: SettingsApi
        self.ai: AiApi
        self.projects: ProjectsApi
        self.products: ProductsApi
        self.partner: PartnerApi
        self.notification: NotificationApi
        self.notes: NotesApi
        self.news: NewsApi
        self.music: MusicApi
        self.knowledge_documents: KnowledgeDocumentsApi
        self.invoice: InvoiceApi
        self.image: ImageApi
        self.style: StyleApi
        self.file_system: FileSystemApi
        self.feedback: FeedbackApi
        self.favorite: FavoriteApi
        self.drive: DriveApi
        self.documents: DocumentsApi
        self.dashboard: DashboardApi
        self.collection: CollectionApi
        self.chat: ChatApi
        self.character: CharacterApi
        self.category: CategoryApi
        self.cart: CartApi
        self.assets: AssetsApi
        self.app: AppApi
        self.announcement: AnnouncementApi
        self.agent: AgentApi
        self.advert: AdvertApi
        self.wallet: WalletApi
        self.vote: VoteApi
        self.vip: VipApi
        self.upload: UploadApi
        self.search: SearchApi
        self.rtc: RtcApi
        self.payments: PaymentsApi
        self.organization: OrganizationApi
        self.orders: OrdersApi
        self.model: ModelApi
        self.history: HistoryApi
        self.sound_effect: SoundEffectApi
        self.generation: GenerationApi
        self.audio: AudioApi
        self.feed: FeedApi
        self.currency: CurrencyApi
        self.coupons: CouponsApi
        self.comments: CommentsApi
        self.auth: AuthApi
        self.audit: AuditApi
        self.analytics: AnalyticsApi
        self.agent_memory: AgentMemoryApi
        self.activity: ActivityApi
        self.account: AccountApi
        self.ab: AbApi
        self.sku: SkuApi

        # Initialize API modules
        self.workspaces = WorkspacesApi(self._client)
        self.voice_speaker = VoiceSpeakerApi(self._client)
        self.video = VideoApi(self._client)
        self.user = UserApi(self._client)
        self.tool = ToolApi(self._client)
        self.tenant = TenantApi(self._client)
        self.social = SocialApi(self._client)
        self.skill = SkillApi(self._client)
        self.shops = ShopsApi(self._client)
        self.share = ShareApi(self._client)
        self.settings = SettingsApi(self._client)
        self.ai = AiApi(self._client)
        self.projects = ProjectsApi(self._client)
        self.products = ProductsApi(self._client)
        self.partner = PartnerApi(self._client)
        self.notification = NotificationApi(self._client)
        self.notes = NotesApi(self._client)
        self.news = NewsApi(self._client)
        self.music = MusicApi(self._client)
        self.knowledge_documents = KnowledgeDocumentsApi(self._client)
        self.invoice = InvoiceApi(self._client)
        self.image = ImageApi(self._client)
        self.style = StyleApi(self._client)
        self.file_system = FileSystemApi(self._client)
        self.feedback = FeedbackApi(self._client)
        self.favorite = FavoriteApi(self._client)
        self.drive = DriveApi(self._client)
        self.documents = DocumentsApi(self._client)
        self.dashboard = DashboardApi(self._client)
        self.collection = CollectionApi(self._client)
        self.chat = ChatApi(self._client)
        self.character = CharacterApi(self._client)
        self.category = CategoryApi(self._client)
        self.cart = CartApi(self._client)
        self.assets = AssetsApi(self._client)
        self.app = AppApi(self._client)
        self.announcement = AnnouncementApi(self._client)
        self.agent = AgentApi(self._client)
        self.advert = AdvertApi(self._client)
        self.wallet = WalletApi(self._client)
        self.vote = VoteApi(self._client)
        self.vip = VipApi(self._client)
        self.upload = UploadApi(self._client)
        self.search = SearchApi(self._client)
        self.rtc = RtcApi(self._client)
        self.payments = PaymentsApi(self._client)
        self.organization = OrganizationApi(self._client)
        self.orders = OrdersApi(self._client)
        self.model = ModelApi(self._client)
        self.history = HistoryApi(self._client)
        self.sound_effect = SoundEffectApi(self._client)
        self.generation = GenerationApi(self._client)
        self.audio = AudioApi(self._client)
        self.feed = FeedApi(self._client)
        self.currency = CurrencyApi(self._client)
        self.coupons = CouponsApi(self._client)
        self.comments = CommentsApi(self._client)
        self.auth = AuthApi(self._client)
        self.audit = AuditApi(self._client)
        self.analytics = AnalyticsApi(self._client)
        self.agent_memory = AgentMemoryApi(self._client)
        self.activity = ActivityApi(self._client)
        self.account = AccountApi(self._client)
        self.ab = AbApi(self._client)
        self.sku = SkuApi(self._client)

    def set_api_key(self, api_key: str) -> 'SdkworkAppClient':
        """Set API key for authentication."""
        self._client.set_api_key(api_key)
        return self

    def set_auth_token(self, token: str) -> 'SdkworkAppClient':
        """Set auth token for authentication."""
        self._client.set_auth_token(token)
        return self

    def set_access_token(self, token: str) -> 'SdkworkAppClient':
        """Set access token for authentication."""
        self._client.set_access_token(token)
        return self

    def set_header(self, key: str, value: str) -> 'SdkworkAppClient':
        """Set custom header."""
        self._client.set_header(key, value)
        return self

    @property
    def http(self) -> HttpClient:
        """Get the underlying HTTP client."""
        return self._client


def create_client(config: SdkConfig) -> SdkworkAppClient:
    """Create a new SDK client instance."""
    return SdkworkAppClient(config)
